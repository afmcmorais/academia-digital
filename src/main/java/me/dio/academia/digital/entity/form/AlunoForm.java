package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "O campo nome é obrigatório")
  @Size(min = 3, max = 50, message = "O campo nome deve ter entre ${min} e ${max} caracteres.")
  private String nome;

  @NotBlank(message = "O campo cpf é obrigatório")
  @CPF(message = "O campo cpf é inválido")
  private String cpf;

  @NotBlank(message = "O campo bairro é obrigatório")
  @Size(min = 3, max = 50, message = "O campo bairro deve ter entre ${min} e ${max} caracteres.")
  private String bairro;

  @NotNull(message = "O campo data de nascimento é obrigatório")
  @Past(message = "O campo data de nascimento deve ser uma data anterior a data atual.")
  private LocalDate dataDeNascimento;
}
