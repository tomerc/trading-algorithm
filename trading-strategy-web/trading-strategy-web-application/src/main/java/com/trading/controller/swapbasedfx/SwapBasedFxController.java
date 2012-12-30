package com.trading.controller.swapbasedfx;

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
@RequestMapping(SwapBasedFxController.JSP_PATH)
public class SwapBasedFxController {
    public static final String JSP_PATH = "/strategy/swapbasedfx";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handle(HttpServletRequest httpServletRequest, ModelMap mm) {
        return null;
    }
}
