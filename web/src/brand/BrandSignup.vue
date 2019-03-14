<template>
    <div>

        <form class="fields">
            <h1 class="title">Get started as a Brand</h1>
            <div class="field">
                <label>Brand</label>
                <b-input v-model="brand" type="text" class="input" />
            </div>
            <div class="field">
                <label>Email</label>
                <b-input v-model="email" type="email" class="input" aria-describedby="emailDisclaimer" />
            </div>
            <div class="field">
                <label>Password</label>
                <b-input v-model="password" type="password" class="input" aria-describedby="emailDisclaimer" />
            </div>

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