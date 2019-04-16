package net.shop.base.controller;

import com.mysql.jdbc.log.LogUtils;
import net.shop.base.entity.ResultMsg;
import net.shop.base.util.ConvertUtil;
import net.shop.base.util.LogUtil;
import org.springframework.ui.ModelMap;

public class BaseController {

    public ResultMsg success() {
        return ResultMsg.success();
    }

    public ResultMsg success(String code, Object... args) {
        return ResultMsg.success(code, args);
    }

    public ResultMsg error(String code, Object... args) {
        return ResultMsg.error(code, args);
    }

    public String errorV(ModelMap map, ResultMsg rmsg) {
        map.addAttribute("errorMsgInfo", rmsg);
        return "/common/error";
    }


    public ResultMsg error(Throwable e) {
        String rnum = ConvertUtil.createRandom(true);
        LogUtil.error(rnum, e);
        return this.error(ConvertUtil.getSimpleExceptionDesc(e)).addRMId(rnum);
    }

}
