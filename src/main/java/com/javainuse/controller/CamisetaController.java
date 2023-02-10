package com.javainuse.controller;

import com.javainuse.model.Camiseta;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CamisetaController {

    private List<Camiseta> camisetas = createList();

    @RequestMapping(value = "/camisetas", method = RequestMethod.GET, produces = "application/json")
    public List<Camiseta> firstPage() {
        return camisetas;
    }

    @DeleteMapping(path = { "/{id}" })
    public Camiseta delete(@PathVariable("id") int id) {
        Camiseta deletedCam = null;
        for (Camiseta cam : camisetas) {
            if (cam.getId() != null)  {
                camisetas.remove(cam);
                deletedCam = cam;
                break;
            }
        }
        return deletedCam;
    }

    @PostMapping
    public Camiseta create(@RequestBody Camiseta camiseta) {
        camisetas.add(camiseta);
        System.out.println(camisetas);
        return camiseta;
    }

    private List<Camiseta> createList() {
        List<Camiseta> tempCamisetas = new ArrayList<>();
        Camiseta camiseta1 = new Camiseta();
        camiseta1.setId("1");
        camiseta1.setTamanho("P");
        camiseta1.setCor("branca");
        camiseta1.setEstampa("cachorro");

        Camiseta camiseta2 = new Camiseta();
        camiseta2.setId("2");
        camiseta2.setTamanho("M");
        camiseta2.setCor("preta");
        camiseta2.setEstampa("urso");
        return tempCamisetas;
    }
}
