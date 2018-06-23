package com.cube001.validatasession;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


/**
 * @Author:张向宇
 * @Description:
 * @Date:Create in 15:01 2018/06/23
 * @Modified By:
 */
@RestController
public class loginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody @Validated loginDto loginDto, BindingResult result)
    {
        if(result.hasErrors())
        {
            Map<String,String> errors=new HashMap<String,String>();
            for (FieldError fieldError : result.getFieldErrors()) {
                errors.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return errors;
        }
        else {
            return "success";
        }
    }
}
