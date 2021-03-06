package com.morben.restapi.exceptions;

public enum ErrorMessages {

	MISSING_DATA("Impossível interpretar as informações recebidas. Verifique."),
    LENGTH_FIELD("Tamanho do ID informado nao corresponde ao padrao. Verifique."),
	MISSING_REQUIRED_FIELDS("Campos obrigatorios não encontrados ou invalidos. Verifique: "),
    RECORD_ALREADY_EXISTS("Registro já cadastrado."),
    INTERNAL_SERVER_ERROR("Internal server error"),
    NO_RECORD_ID_FOUND("Nenhum registro encontrado com o ID informado."),
    NO_RECORD_FOUND("Nenhum registro encontrado."),
    NO_HOUSE_ID_FOUND("Nenhum registro encontrado com o House ID informado."),
    NO_HOUSE_FOUND("Nenhum cadastro de House encontrado."),
    AUTHENTICATION_FAILED("Authentication failed");

    private String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}