package com.gmb.main.web.application;

import com.gmb.main.business.service.BindingsService;
import com.gmb.main.data.entity.Bindings;
import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Level;
import com.gmb.main.data.entity.cons.Strap;
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
    public String addBindings(ModelMap model) throws Exception {

        model.put("bindings", new Bindings());
        model.put("brands", Brand.values());
        model.put("straps", Strap.values());
        model.put("flexes", Flex.values());
        model.put("levels", Level.values());
        return "bindings/add_bindings";
    }

    @PostMapping("/add")
    public String addBindings(@ModelAttribute Bindings bindings) throws Exception {

        bindingsService.create(bindings);
        return "redirect:../list";
    }

    @GetMapping("/edit/{id}")
    public String updateBindings(@PathVariable Long id, ModelMap model) throws Exception {

        Bindings bindings = bindingsService.findOneById(id)
                                            .orElseThrow(() -> new RuntimeException("Invalid bindings id"));

        model.put("bindings", bindings);
        model.put("brands", Brand.values());
        model.put("straps", Strap.values());
        model.put("flexes", Flex.values());
        model.put("levels", Level.values());
        return "bindings/edit_bindings";
    }

    @PostMapping("/edit")
    public String updateBindings(@ModelAttribute Bindings bindings) throws Exception {

        bindingsService.update(bindings);
        return "redirect:../list";
    }

    @GetMapping("/remove/{id}")
    public String removeBindingsById(@PathVariable Long id) throws Exception {

        bindingsService.removeById(id);
        return "redirect:../list";
    }
}