<template>
    <div>
        <form v-on:submit.exact="sub" action="#" method="post" @submit.prevent="postPost">
            <label class="field">Name</label>
            <input v-model="name" type="text" class="input" placeholder="Name">
            <button type="submit" class="button">Submit</button>
        </form>
    </div>
</template>

<script>
    import axios from "axios";
    export default {
        name: "sign-up.vue",
        data() {
            return {
                name: ''
            }
        },
        methods: {
            postPost() {
                axios.post('http://localhost:8080/input', this.name).then(response => {this.name = response.data})
            }
        }

    }
</script>

<style>

</style>