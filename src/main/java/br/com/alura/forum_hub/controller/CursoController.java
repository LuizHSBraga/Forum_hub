package br.com.alura.forum_hub.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/curso")
@SecurityRequirement(name="bearer-key")
public class CursoController {
    @Autowired
    private CursoService service;

    @PostMapping("")
    @Transactional
    public ResponseEntity<String> cadastrarCurso(@RequestBody @Valid CursoDto cursoDto,
                                                 UriComponentsBuilder uriComponentsBuilder) {

        Long cursoId = service.saveCurso(cursoDto);
        var uri = uriComponentsBuilder.path("/curso/{id}")
                .buildAndExpand(cursoId)
                .toUri();
        return ResponseEntity.created(uri)
                .body("Curso registrado com sucesso");

    }


    @GetMapping("")
    public ResponseEntity<Page<CursoIdDto>> listarCursos(Pageable pageable) {
        Page<CursoIdDto> cursosPage = service.getAllCursos(pageable);
        return ResponseEntity.ok(cursosPage);
    }


    @PutMapping("/{cursoId}")
    public ResponseEntity<String> atualizarCurso(
            @PathVariable Long cursoId,
            @RequestBody CursoIdDto cursoIdDto) {

        service.updateCurso(cursoId, cursoIdDto);
        return ResponseEntity.ok("Curso atualizado com sucesso.");

    }
}
