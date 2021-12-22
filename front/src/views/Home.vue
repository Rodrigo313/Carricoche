<template>
  <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col"><img id="logo" alt="Logo coche" src="../assets/logo-coche.jpg"></div>

        <div class="home">
          <carousel :slides="slides"></carousel>
        </div>
      </div>
    </div>
  </body>
</template>

<script>
import Carousel from "@/components/Carousel.vue";
export default {
  components: {Carousel},
      data: () => ({
        slides: [
          "https://picsum.photos/id/237/200/300",
          "https://picsum.photos/id/238/200/300",
          "https://picsum.photos/id/239/200/300",
          "https://picsum.photos/id/240/200/300",
          "https://picsum.photos/id/241/200/300"
        ],
      }),
    };
</script>


<style scoped>
#logo{
  width: 200px;
  height: 100px;
  margin-top: 30px;
  position: fixed;
  left: 500px;
  top: 0;
  right: 0;
}
.home{
  /*background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size: cover;*/
  margin-top: 150px;

}
</style>
