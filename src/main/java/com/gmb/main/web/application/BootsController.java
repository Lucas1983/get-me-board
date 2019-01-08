package com.gmb.main.web.application;

import com.gmb.main.business.service.BootsService;
import com.gmb.main.data.entity.Boots;
import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Lacing;
import com.gmb.main.data.entity.cons.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boots")
public class BootsController implements EquipmentControllerIfc {

    private BootsService bootsService;

    @Autowired
    public BootsController(BootsService bootsService) {
        this.bootsService = bootsService;
    }

    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "Main BOOTS page";
    }

    @GetMapping("/list")
    public String listBoots(ModelMap model) throws Exception {

        model.put("boots_list", bootsService.findAll());
        return  "boots/list_boots";
    }

    @GetMapping("/add")
    public String addBoots(ModelMap model) throws Exception {

        model.put("boots", new Boots());
        model.put("brands", Brand.values());
        model.put("lacings", Lacing.values());
        model.put("flexes", Flex.values());
        model.put("levels", Level.values());
        return "boots/add_boots";
    }

    @PostMapping("/add")
    public String addBoots(@ModelAttribute Boots boots) throws Exception {

        bootsService.save(boots);
        return "redirect:list";
    }

    @GetMapping("/remove/{id}")
    public String removeBootsById(@PathVariable Long id) throws Exception {

        bootsService.deleteById(id);
        return "redirect:../list";
    }
}
