<template>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    </head>

    <body>

        <ul v-for="(anuncios) in anuncio" :key="anuncios">
            <div v-if="this.informacionDelete == anuncios.id_anuncio">
                        <h2>Pulse eliminar</h2>

            <span v-for="(anuncios) in anuncio" :key="anuncios">

                <div v-if="this.informacionDelete == anuncios.id_anuncio">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id anuncio</th>
                                <th scope="col">Coche</th>
                                <th scope="col">Provincia</th>
                                <th scope="col">Teléfono</th>
                                <th scope="col">Correo Electrónico</th>
                                <th scope="col">Precio</th>
                                <th scope="col">Segunda mano</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(anuncios) in anuncio" :key="anuncios" @click="obtenerCommercial(anuncios.id_anuncio)">
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">{{anuncios.id_anuncio}}</td>
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">{{anuncios.coche}}</td>
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">
                                    <span>
                                        <ul v-for="(provincias) in provincias" :key="provincias">
                                            <li v-if="anuncios.id_provincia == provincias.id_provincia">{{provincias.nombre}}</li>
                                        </ul>
                                    </span>
                                </td>
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">{{anuncios.telefono}}</td>
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">{{anuncios.correo_electronico}}</td>
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">{{anuncios.precio}}</td>
                                <td v-if="anuncios.id_anuncio == this.informacionDelete">{{anuncios.segunda_mano}}</td>
                            </tr>
                        </tbody>
                    </table>
                    <form>
                    <button type="submit" class="btn btn-primary mb-3" @click="borrar">Eliminar</button>
                    </form>
                </div>
            </span>
            </div>
        </ul>
        <br>
    </body>
</template>

<script>
import axios from "axios";
export default{
   props:[
       "informacionDelete"
   ],
   data(){
       return{
           anuncio: [],
           provincias: [],
           ocultar: "",
           ubicacion: "",
           numero: "",
           correo: "",
           dinero: "",
           segunda: false,
           id: ""
       }
   },
   created(){
        axios.get("http://localhost:8080/carricoche/v1/anuncios").then((response) => {
            this.anuncio = response.data
        }),
        axios.get("http://localhost:8080/carricoche/v1/provincias").then((response) => {
            this.provincias = response.data
      })
   },
   methods: {
        informacionAnuncios: function(coche, provincia, telefono, correo_electronico, precio, segunda_mano, id_anuncio){
            this.ocultar = coche;
            this.ubicacion = provincia;
            this.numero = telefono;
            this.correo = correo_electronico;
            this.dinero = precio;
            this.segunda = segunda_mano;
            this.id = id_anuncio;
        },
        borrar(){
            axios.delete('http://localhost:8080/carricoche/v1/anuncios/'+this.informacionDelete);
        }
   }
}
</script>

<style>
.info{
    list-style: none;
    font-size: x-large;
}
li {
    list-style: none;
}
</style>