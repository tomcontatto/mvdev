package mv.backend.anagrama.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Anagrama {

    @NotNull
    @Size(max = 255)
    private String primeiraPalavra;

    @NotNull
    @Size(max = 255)
    private String segundaPalavra;

}
