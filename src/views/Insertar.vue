<template>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col"><img alt="Logo coche" src="../assets/logo-coche.jpg"></div>
        <div class="col"><img alt="Logo coche 2" id="logoLargo" src="../assets/logo-coche2.jpg"></div>
        <div class="anuncios">
          <h1>Insertar anuncios</h1>
          <br>
          <Create/>
        </div>
      </div>
    </div>
  </body>
</template>

<script>
import Create from '@/components/Create.vue'
export default {
  name: 'Insertar',
  components: {
    Create
  }
}
</script>

<style scoped>
img{
  width: 200px;
  height: 100px;
  margin-top: 30px;
  /*position: fixed;*/
  left: 500px;
  top: 0;
  right: 0;
}
#logoLargo{
  width: 580px;
  margin-right: 360px;
}
.anuncios{
  width: 1600px;
  height: auto;
  margin-top: 150px;
  border: 1px solid black;
}
</style>
