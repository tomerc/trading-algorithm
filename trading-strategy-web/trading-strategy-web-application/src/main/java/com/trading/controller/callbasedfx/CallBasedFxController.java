package com.trading.controller.callbasedfx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Tomer Cohen
 */
@Controller
@RequestMapping(CallBasedFxController.JSP_PATH)
public class CallBasedFxController {
    public static final String JSP_PATH = "/strategy/callbasedfx";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handle(HttpServletRequest httpServletRequest, ModelMap mm) {
        return null;
    }
}
