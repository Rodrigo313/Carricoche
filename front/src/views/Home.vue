<template>
  <head>
      <!--<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">-->
  </head>
  <body>
    <div class="container">
      <div class="row">


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
          "https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019_960_720.jpg",
          "https://cdn.pixabay.com/photo/2016/02/13/13/11/oldtimer-1197800_960_720.jpg",
          "https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220_960_720.jpg",
          "https://cdn.pixabay.com/photo/2016/11/21/18/07/automotive-1846910_960_720.jpg",
          "https://cdn.pixabay.com/photo/2016/05/06/16/32/car-1376190_960_720.jpg"
        ],
      }),
    };
</script>


<style scoped>
.home{
  /*background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size: cover;*/
  margin-top: 150px;

}
</style>
