/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static void main(String[] args) {
        
        //Constantes
        double DINERITO = 2.00;
        double PELICULA = 1.30;
        double PALOMITAS = 0.90;
        
        //Variables
        double partePalomitas = PALOMITAS / 2;
        double gastos = PELICULA + PALOMITAS / 2;
        double dineritoRestante = DINERITO - gastos;
        
        //Rotulo
        System.out.printf("Secuencia de Kung-Fu %n====================%n");
        
        //Mensajes
        System.out.printf("Dinero inicial .....: %.2f €%n---%n", DINERITO);
        System.out.printf("Precio película ....: %.2f €%n", PELICULA);
        System.out.printf("Parte palomitas ....: %.2f €%n---%n", partePalomitas);
        System.out.printf("Gastos por persona .: %.2f €%n---%n", gastos);
        System.out.printf("Dinero restante ....: %.2f €%n", dineritoRestante);
        
    }
}
