<template>
    <div>
        <form class="fields">

            <h1 class="title">Enter your name to be recognized</h1>

            <div class="field">
                <label>First name</label>
                <b-input v-model="firstName" type="text" class="input"/>
            </div>

            <div class="field">
                <label>Last name</label>
                <b-input v-model="lastName" type="text" class="input"/>
            </div>

            <router-link to="/influencerSignupLinks" class="router-link-text-button">
                <b-button type="submit" class="button-main" @click="postPost">Next</b-button>
            </router-link>

        </form>
    </div>
</template>

<script>
    export default {
        name: "influencer-signup-name",

        data() {
            return {
                firstName: "",
                lastName: ""
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