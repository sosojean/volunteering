package com.inha.volunteer.volunteer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
public class VolunteeringController {
    @Autowired
    private VolunteeringService volunteeringService;

    @GetMapping("/get")
    public ResponseEntity<List<VolunteeringDto>> getAll() {
        List<VolunteeringDto> dtos = volunteeringService.getAllInfo();
        if (dtos == null || dtos.size() == 0) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/get/{location}")
    public ResponseEntity<List<VolunteeringDto>> getInfoWithLocation(@PathVariable Integer location) {
        List<VolunteeringDto> dtos = volunteeringService.getInfoWithGugunCd(location);
        if (dtos == null || dtos.size() == 0) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/set")
    public String set() {
        volunteeringService.setInfo();
        return "ok";

    }


}
