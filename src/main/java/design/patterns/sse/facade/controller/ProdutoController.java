package design.patterns.sse.facade.controller;
import design.patterns.sse.facade.facade.Fachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class ProdutoController {
//SSE
    @Autowired
    Fachada fachada;

    @GetMapping("/produtos")
    public SseEmitter pesquisarProdutos() {
        SseEmitter emitter = new SseEmitter();
        fachada.pesquisarProduto().forEach(produto -> {
            try {
                emitter.send(produto);
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        });
        return emitter;
    }

    @GetMapping("/emails")
    public SseEmitter enviarEmails() {
        SseEmitter emitter = new SseEmitter();

        new Thread(() -> {
            fachada.receberOfertasEmail().forEach(oferta -> {
                try {
                    emitter.send(oferta);
                    Thread.sleep(2000);
                } catch (Exception e) {
                    emitter.completeWithError(e);
                }
            });
            emitter.complete();
        }).start();
        return emitter;
    }

    @GetMapping("/carrinho")
    public SseEmitter visualizarCarrinho() {
        SseEmitter emitter = new SseEmitter();
        fachada.visualizarCarrinho().forEach(produto -> {
            try {
                emitter.send(produto);
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        });
        return emitter;
    }

    @GetMapping("/produto")
    public SseEmitter consultarProduto() {
        SseEmitter emitter = new SseEmitter();
        try {
            emitter.send(fachada.consultarProduto(1));
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
        return emitter;
    }
}
