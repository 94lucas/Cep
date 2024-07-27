package br.com.fiap.consultacep.model

import com.google.gson.annotations.SerializedName

data class Endereco(
    val cep: String = "",
    @SerializedName("logradouro")
    val rua: String = "",
    @SerializedName("localidade")
    val bairro: String = "",
    val uf: String = "",
    val cidade: String = ""
) {
}