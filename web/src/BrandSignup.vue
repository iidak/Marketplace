<template>
    <div>
        <h1 class="title">Get started as a Brand</h1>
        <form>
            <input v-model="brand" type="text" class="input" placeholder="Brand">
            <input v-model="email" type="email" class="input" placeholder="Email">
            <input v-model="password" type="password" class="input" placeholder="Password">
            <router-link to="/brandPage" class="router-link-text-button">
                <b-button type="submit" class="button-main" @click="postPost">Next</b-button>
            </router-link>
        </form>
    </div>
</template>

<script>

    export default {
        name: "influencer-signup",

        data() {
            return {
                brand:"",
                email: "",
                password: ""
            }
        },

        methods: {
            postPost() {
                //axios.post('http://localhost:8080/input', {email: this.email, password: this.password, role: "influencer"}).then(response => {this.name = response.data})
            }
        }
    }
</script>

<style scoped>

</style>