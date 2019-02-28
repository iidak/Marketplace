<template>
    <div id="app">

        <router-view></router-view>
        <HelloWorld v-bind:msg="hello"/>
    </div>
</template>


<script>
    import HelloWorld from './components/HelloWorld.vue'
    import axios from "axios";
    import 'bootstrap/dist/css/bootstrap.css'
    import 'bootstrap-vue/dist/bootstrap-vue.css'

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

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

nav {
    padding: 20px 20px 20px 0;
}

nav a {
    padding: 10px;
    text-decoration: none;
    background: rgb(0, 110, 255);
    border-radius: 3px;
    color: #fff;
    font-weight: bold;
    margin-right: 15px;
}
</style>
