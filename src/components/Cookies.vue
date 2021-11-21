<template>
    <div class="cookie" :class="containerPosition" v-if="isOpen">
        <div class="contenido">
            <slot name="mensaje">
                {{mensaje}}
            </slot>
        </div>
        <div id="boton" class="aceptar" @click="aceptar">
            {{botonAceptar}}
        </div>
        <div id="boton" class="denegar" @click="denegar">
            {{botonDenegar}}
        </div>
    </div>
</template>

<script>
export default {
    name: 'Cookies',
    props:{
        botonAceptar: {
            type: String,
            default: 'Aceptar'
        },
        botonDenegar: {
            type: String,
            default: 'Denegar'
        },
        mensaje: {
            type: String,
            default: 'Esta página web utiliza servicios de terceros para recopilar información con fines estadísticos y de uso de la web. Se usan cookies de Carricoche para mejorar la publicidad que se incluye en el sitio web. Son utilizadas para orientar la publicidad según el contenido que es relevante para un usuario, mejorando así la calidad de experiencia en el uso del mismo.'
        },
        position: {
            type: String,
            default: 'bottom'
        },
    },
    data(){
        return{
            isOpen: false
        }
    },
    computed: {
        containerPosition(){
            return `cookie--${this.position}`;
        }
    },
    created(){
        if(!this.getGDPR() === true){
            this.isOpen = true;
        }
    },
    methods:{
        getGDPR(){
            return localStorage.getItem('GDPR:accept', true);
        },
        aceptar(){
            this.isOpen = false;
            localStorage.setItem('GDPR:accept', true);
        },
        denegar(){
            this.isOpen = false;
            localStorage.setItem('GDPR:accept', false);
        }
    }
}
</script>

<style scoped>
    .cookie{
        position: fixed;
        display: grid;
        grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
        grid-gap: 12px;
        padding: 10px;
        background: #f2f2f2;
    }

    .contenido{
        grid-column: auto / span 5;
        padding: 5px;
        text-align: left;
    }

    #boton{
        margin: 15px 0;
        grid-column: auto / span 1;
    }

    .aceptar{
        padding: 5px;
        background: rgb(255, 0, 0);
        color: #ffffff;
        cursor: pointer;
    }

    .aceptar:hover{
        background: rgb(127, 38, 38);
    }

    .denegar{
        padding: 5px;
        background: rgb(255, 0, 0);
        color: #ffffff;
        cursor: pointer;
    }

    .denegar:hover{
        background: rgb(127, 38, 38);
    }
</style>