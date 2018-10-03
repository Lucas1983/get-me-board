package com.gmb.web.application;

import com.gmb.business.service.BindingsService;
import com.gmb.data.entity.eqt.Bindings;
import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Level;
import com.gmb.data.entity.cons.Strap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bindings")
public class BindingsController implements EquipmentControllerIfc{

    private BindingsService bindingsService;

    @Autowired
    public BindingsController(BindingsService bindingsService) {
        this.bindingsService = bindingsService;
    }


    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "Main BINDINGS page";
    }

    @GetMapping("/list")
    public String listBindings(ModelMap model) throws Exception {

        model.put("bindings_list", bindingsService.findAll());
        return "bindings/list_bindings";
    }

    @GetMapping("/add")
    public String addBinding(ModelMap model) throws Exception {

        model.put("bindings", new Bindings());
        model.put("brands", Brand.values());
        model.put("straps", Strap.values());
        model.put("flexes", Flex.values());
        model.put("levels", Level.values());
        return "bindings/add_bindings";
    }

    @PostMapping("/add")
    public String addBinding(@ModelAttribute Bindings bindings) throws Exception {

        bindingsService.save(bindings);
        return "redirect:list";
    }
}