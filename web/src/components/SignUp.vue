<template>
    <div>
        <form>
            <label class="field">Name</label>
            <input v-model="name" type="text" class="input" placeholder="Name">
            <input v-model="password" type="password" class="input" placeholder="Password">
            <button type="submit" class="button" @click="postPost">Submit</button>
        </form>
    </div>
</template>

<script>
    import axios from "axios";

    export default {
        name: "sign-up.vue",
        data() {
            return {
                name: "",
                password: ""
            }
        },

        methods: {
            postPost() {
                axios.post('http://localhost:8080/input', {name: this.name, password: this.password}).then(response => {this.name = response.data})
            }
        }

    }
</script>

<style>

</style>