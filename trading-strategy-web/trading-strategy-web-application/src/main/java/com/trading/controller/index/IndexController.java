package com.trading.controller.index;

import com.trading.controller.callbasedfx.CallBasedFxController;
import com.trading.controller.putbased.PutBasedFxController;
import com.trading.controller.swapbasedfx.SwapBasedFxController;
import com.trading.formbacking.index.ChooseStrategyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Tomer Cohen
 */
@Controller
@RequestMapping("/index/")
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handle(HttpServletRequest httpServletRequest, ModelMap mm) {
        mm.addAttribute("command", new ChooseStrategyBean());
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, params = {})
    public String chooseStrategy(HttpServletRequest httpServletRequest,
                                 @ModelAttribute("command") ChooseStrategyBean bean, BindingResult result) {
        log.debug("The action that was chosen to proceed with is: '{}'", bean.getAction());
        switch (bean.getAction()) {
            case PUTBASEDFX:
                return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "/app" + PutBasedFxController.JSP_PATH;
            case CALLBASEDFX:
                return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "/app" + CallBasedFxController.JSP_PATH;
            case SWAPBASEDFX:
                return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "/app" + SwapBasedFxController.JSP_PATH;
        }
        return null;
    }

}
