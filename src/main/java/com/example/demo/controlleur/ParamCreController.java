package com.example.demo.controlleur;

import com.example.demo.model.ParamCre;
import com.example.demo.service.ParamCreService;

import io.micrometer.common.util.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paramcre")
@CrossOrigin(origins = "http://localhost:4200")
public class ParamCreController {
    private final ParamCreService paramCreService;

    @Autowired
    public ParamCreController(ParamCreService paramCreService) {
        this.paramCreService = paramCreService;
    }

    @PostMapping("/add")
    public ResponseEntity<ParamCre> addParamCre(@RequestBody ParamCre paramCre) {
        ParamCre newParamCre = paramCreService.addParamCre(paramCre);
        return new ResponseEntity<>(newParamCre, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ParamCre>> getAllParamCres() {
        List<ParamCre> paramCres = paramCreService.getAllParamCres();
        return new ResponseEntity<>(paramCres, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParamCre> getParamCreById(@PathVariable Long id) {
        Optional<ParamCre> paramCre = paramCreService.getParamCreById(id);
        return paramCre.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/search/{codeDomaine}/{codeApplication}/{codeEvenement}/{codeStructure}/{codeEmetteur}")
    public ResponseEntity<List<ParamCre>> searchByCodes(
        @PathVariable(required = false) String codeDomaine,
        @PathVariable(required = false) String codeApplication,
        @PathVariable(required = false) String codeEvenement,
        @PathVariable(required = false) String codeStructure,
        @PathVariable(required = false) String codeEmetteur
    ) {
        if (StringUtils.isEmpty(codeApplication)) {
            codeApplication = "*";
        }
        if (StringUtils.isEmpty(codeDomaine)) {
            codeDomaine = "*";
        }
        if (StringUtils.isEmpty(codeEmetteur)) {
            codeEmetteur = "*";
        }
        if (StringUtils.isEmpty(codeStructure)) {
            codeStructure = "*";
        }
        List<ParamCre> paramCres = paramCreService.getParamCreBycodes(
            codeDomaine,
            codeApplication,
            codeEvenement,
            codeStructure,
            codeEmetteur
        );
        return new ResponseEntity<>(paramCres, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ParamCre> updateParamCre(@RequestBody ParamCre paramCre) {
        ParamCre updatedParamCre = paramCreService.updateParamCre(paramCre);
        return new ResponseEntity<>(updatedParamCre, HttpStatus.OK);
    }

    @DeleteMapping("/desactiver/{id}")
    public ResponseEntity<Void> desactiver(@PathVariable Long id) {
        paramCreService.desactiver(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/activer/{id}")
    public ResponseEntity<Void>activer (@PathVariable Long id) {
        paramCreService.activer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
