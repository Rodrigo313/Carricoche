<template>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  </head>
  <body>
  <div class="container">
    <div class="row">


      <div class="anuncios">
        <h1>Modificar anuncios</h1>
        <h4>Selecciona un anuncio</h4>
        <br>

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
                    <td>{{anuncios.id_anuncio}}</td>
                    <td>{{anuncios.coche}}</td>
                    <td>
                        <span>
                            <ul v-for="(provincias) in provincias" :key="provincias">
                                <li v-if="anuncios.id_provincia == provincias.id_provincia">{{provincias.nombre}}</li>
                            </ul>
                        </span>
                    </td>
                    <td>{{anuncios.telefono}}</td>
                    <td>{{anuncios.correo_electronico}}</td>
                    <td>{{anuncios.precio}}</td>
                    <td>{{anuncios.segunda_mano}}</td>
                </tr>
            </tbody>
        </table>
        <br><br>

        <div v-if="commercial != ''">
            <Modify :informacionCommercial="commercial" />
        </div>
      </div>
    </div>
  </div>
  </body>

</template>

<script>
import axios from 'axios';
import Modify from '@/components/Modify.vue'
export default {

  data(){
      return{
          anuncio: [],
          provincias: [],
          commercial: ""
      }
  },
   methods:{
      obtenerProvincias(){
       axios.get("http://localhost:8080/carricoche/v1/provincias").then((response) => {
          this.provincias = response.data
      })
      },
      obtenerAnuncios(){
          axios.get("http://localhost:8080/carricoche/v1/anuncios").then((response) => {
              this.anuncio = response.data
          })
      },
      obtenerCommercial: function(id){
        this.commercial = id;
      }
  },
  created(){
      this.obtenerAnuncios();
      this.obtenerProvincias();
  },
  components: {
    Modify
  }
}
</script>


<style scoped>
.anuncios{
  width: 1600px;
  height: auto;
  margin-top: 150px;
  border: 1px solid black;
}
li {
    list-style: none;
}
</style>