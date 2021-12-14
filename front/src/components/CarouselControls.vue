<template>
    <button class="carousel-control izq" @click="$emit('prev')">Prev</button>
    <button class="carousel-control der" @click="$emit('next')">Next</button>
</template>


<script>
export default {
    emits: ['prev', 'next']
}
</script>

<style scoped>
    .carousel-control{
        background-color: rgba(0, 0, 0, 0.5);
        border: none;
        display: inline-block;
        position: absolute;
        height: 50px;
        width: 70px;
        top: calc(50% - 25px);
        color: #f3f3f3;
        cursor: pointer;
    }
    .izq{
        left: 0;
    }
    .der{
        right: 0;
    }
</style>