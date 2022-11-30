package com.rihem.servicesentreparticuliers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rihem.servicesentreparticuliers.entities.Particulier;
import com.rihem.servicesentreparticuliers.service.ParticulierService;

@RestController
@RequestMapping("/Particulier/")
public class ParticulierController {
	@Autowired
    private ParticulierService particulierService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/save")
    public Particulier saveParticulier (@RequestBody Particulier particulier) {

        return particulierService.saveParticulier(particulier);
    }

    @PutMapping("/update")
    public Particulier updateParticulier(@RequestBody Particulier particulier) {
        return particulierService.updateParticulier(particulier);
    }

    @GetMapping("/getall")
    public List<Particulier> getAllParticulier() {
        return particulierService.getAllParticulier();
    }

    @GetMapping("/getone/{particulierId}")
    public Particulier getParticulier(@PathVariable(name = "particulierId") Long particulierId) {
        return particulierService.getParticulier(particulierId);
    }

    @DeleteMapping("/delete/{particulierId}")
    public void deleteParticulier(@PathVariable(name = "particulierId") Long particulierId) {
        particulierService.deleteParticulier(particulierId);
    }

}
