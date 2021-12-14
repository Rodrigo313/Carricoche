<template>
  <div class="create">
      <head>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
      </head>
      <body>
        <form>
          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Coche</span>
              <input type="text" class="form-control" aria-label="Coche" aria-describedby="basic-addon1" v-model="var1">
          </div>
          <div class="error" v-if="var1.required">Campo obligatorio.</div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Provincia</span>
              <select class="form-select" aria-label="Default select example" v-model="var2">
                  <option v-for="(provincia, index) in provincias" :key="index" v-bind:value="provincia.id_provincia">{{provincia.nombre}}</option>
              </select>
          </div>
          <div class="error" v-if="var2.required">Campo obligatorio.</div>
          <br>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Teléfono</span>
              <input type="text" class="form-control" aria-label="Teléfono" aria-describedby="basic-addon2" v-model="var3">
          </div>
          <div class="error" v-if="var3.required">Campo obligatorio.</div>

          <div class="input-group mb-3">
              <input type="text" class="form-control" placeholder="ejemplo@gmail.com" aria-label="Correo electrónico" aria-describedby="basic-addon3" v-model="var4">
          </div>
          <div class="error" v-if="var4.required">Campo obligatorio.</div>

          <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Precio</span>
              <input type="text" class="form-control" aria-label="Precio" aria-describedby="basic-addon2" v-model="var5">
          </div>
          <div class="error" v-if="var5.required">Campo obligatorio.</div>

            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon2">Segunda mano</span>

              <div class="form-check">
                <input type="radio" class="form-check-input" name="flexRadioDefault" value="si" aria-describedby="basic-addon2">
                <label class="form-check-label" for="si">Si</label>
              </div>
              <div class="form-check">
                <input type="radio" class="form-check-input" name="flexRadioDefault2" value="no" aria-describedby="basic-addon2">
                <label class="form-check-label" for="no">No</label>
              </div>
          </div>
          <div class="error" v-if="var6.required">Campo obligatorio.</div>

          <div class="input-group mb-3">
              <button type="submit" class="btn btn-primary mb-3" @click="enviar">Crear</button>
          </div>
        </form>
      </body>
  </div>
</template>

<script>
import axios from 'axios';
import {required} from 'vuelidate/lib/validators';
export default {

  data(){
      return{
          provincias: [],
          var1: '',
          var2: '',
          var3: '',
          var4: '',
          var5: '',
          var6: true
      }
  },
  methods:{
    obtenerProvincias(){
       axios.get("http://localhost:8080/carricoche/v1/provincias").then((response) => {
          this.provincias = response.data
      })
    },
    enviar(){
        let post = {
            coche: this.var1,
            id_provincia: this.var2,
            telefono: this.var3,
            correo_electronico: this.var4,
            precio: this.var5,
            segunda_mano: this.var6
        };
        axios.post('http://localhost:8080/carricoche/v1/anuncios', post)
        .then((result) => {
            console.log(result)
        })
    }
  },
  validations: {
      var1:{
          required
      },
      var2:{
          required
      },
      var3:{
          required
      },
      var4:{
          required
      },
      var5:{
          required
      },
      var6:{
          required
      }
  },
  created(){
      this.obtenerProvincias();
  }
}
</script>
<style scoped>
input[name="flexRadioDefault"] {
  margin-left: 10px;
}
input[name="flexRadioDefault2"] {
  margin-left: 50px;
}
</style>
