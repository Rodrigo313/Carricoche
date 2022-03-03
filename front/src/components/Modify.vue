<template>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    </head>

    <body>

        <form v-for="(anuncios) in anuncio" :key="anuncios">
            <div v-if="this.informacionCommercial == anuncios.id_anuncio">
                        <h2>Datos a modificar</h2>
            <h4>Debe rellenar todos los campos</h4>
            <span v-for="(anuncios) in anuncio" :key="anuncios">

                <div v-if="this.informacionCommercial == anuncios.id_anuncio">
                    <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Coche</span>
              <input type="text" class="form-control" aria-label="Coche" aria-describedby="basic-addon1" v-model="var1" required value="{{anuncios.coche}}">
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Provincia</span>
              <select class="form-select" aria-label="Default select example" v-model="var2" required>
                  <option v-for="(provincia, index) in provincias" :key="index" v-bind:value="provincia.id_provincia">{{provincia.nombre}}</option>
              </select>
          </div>
          <br>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Teléfono</span>
              <input type="number" max="9" class="form-control" aria-label="Teléfono" aria-describedby="basic-addon2" v-model="var3" required>
          </div>

          <div class="input-group mb-3">
              <input type="email" class="form-control" placeholder="ejemplo@gmail.com" aria-label="Correo electrónico" aria-describedby="basic-addon3" v-model="var4" required>
          </div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Precio</span>
              <input type="number" class="form-control" aria-label="Precio" aria-describedby="basic-addon2" v-model="var5" required>
          </div>

            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Segunda mano</span>

              <div class="form-check">
                <input id="segunda" type="checkbox" name="segunda">
              </div>
          </div>
          <div class="error" v-if="var6.required">Campo obligatorio.</div>


                    <div class="input-group mb-3">
                        <button type="submit" class="btn btn-primary mb-3" @click="enviar">Modificar</button>
                    </div>
                </div>
            </span>
            </div>
        </form>
        <br>
    </body>
</template>

<script>
import axios from "axios";
export default{
   props:[
       "informacionCommercial"
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
           id: "",
           var1: '',
           var2: '',
           var3: '',
           var4: '',
           var5: '',
           var6: false
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
            this.equipo = correo_electronico;
            this.dinero = precio;
            this.segunda = segunda_mano;
            this.id = id_anuncio;
        },
        enviar(){
            let post = {
                id_anuncio: this.informacionCommercial,
                coche: this.var1,
                id_provincia: this.var2,
                telefono: this.var3,
                correo_electronico: this.var4,
                precio: this.var5,
                segunda_mano: this.var6
            };
            axios.put('http://localhost:8080/carricoche/v1/anuncios/'+ this.informacionCommercial, post);
            location.reload();
        }
   }
}
</script>

<style>
input[name="flexRadioDefault"] {
  margin-left: 10px;
}
input[name="flexRadioDefault2"] {
  margin-left: 50px;
}
.info{
    list-style: none;
    font-size: x-large;
}
#segunda{
    width: 45px;
    height: 45px;
}
</style>