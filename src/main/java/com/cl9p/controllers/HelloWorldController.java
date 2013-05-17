package com.cl9p.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

@Controller
public class HelloWorldController implements ServletContextAware {
    Logger logger = Logger.getLogger(HelloWorldController.class);
    private ServletContext servletContext;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = servletContext.getResourceAsStream("META-INF/MANIFEST.MF");
        properties.load(inputStream);
        model.addAttribute("manifest", properties);
        for (String p : properties.stringPropertyNames()) {
            logger.info(p + ": " + properties.getProperty(p));
        }
        return "home";
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    private String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }
}
