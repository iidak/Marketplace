<template>
    <div id="app">

        <router-view>Router</router-view>
    </div>
</template>


<script>
    export default {
        name: 'app',
    }
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
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
