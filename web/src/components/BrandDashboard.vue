<template>
    <div>
        <h1>Matches: </h1>
        <HelloWorld v-bind:msg="hello"/>
    </div>
</template>

<script>
    import HelloWorld from './HelloWorld.vue'
    import axios from "axios";
    export default {
        name: 'app',
        components: {
            HelloWorld,
        },
        data() {
            return {
                hello: null
            }
        },
        mounted () {
            axios.get('http://localhost:8080/roles').then(response => (this.hello = response.data));
        }
    }
</script>

<style scoped>

</style>