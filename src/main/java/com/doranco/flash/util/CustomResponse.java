package com.doranco.flash.util;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;

/**
 * Cette classe permet de generer une reponse à toute requete dans notre application
 */
public class CustomResponse {

    /**
     * Retourne une reponse de success avec un status de type 20X
     *
     * @param status est le status  de la reponse HTTP
     * @param data   est la donnee a envoyer au client
     * @param <T>    est le type du deuxieme parametre de la fontion
     * @return est la reponse finale a envoyer au client
     */
    public static <T> ResponseEntity<?> succesResponse(int status, T data) {
        //creer un objet JSON
        JSONObject response = new JSONObject();
        response.put("data", data);//ajouter la donnee
        response.put("error", false);//aucune erreur
        return ResponseEntity.status(status).body(response.toMap());//ajouter toMap pour convertir en string

    }

    /**
     * Retourne une reponse d'echecs avec un status de type 40X ou 50X
     *
     * @param status est le status  de la reponse HTTP
     * @param data   est la donnee a envoyer au client
     * @param <T>    est le type du deuxieme parametre de la fontion
     * @return est la reponse finale a envoyer au client
     */
    public static <T> ResponseEntity<?> errorResponse(int status, T data) {
        //creer un objet JSON
        JSONObject response = new JSONObject();
        response.put("message", data);//ajouter la donnee
        response.put("error", true);//aucune erreur
        return ResponseEntity.status(status).body(response.toMap());//ajouter toMap pour convertir en string

    }
}
