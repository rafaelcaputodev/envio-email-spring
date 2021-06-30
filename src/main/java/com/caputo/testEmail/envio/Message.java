package com.caputo.testEmail.envio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String remetente;
    private List<String> destinatarios;
    private String assunto;
    private String corpo;
}
