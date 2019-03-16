<template>
    <div>
        <form class="fields">
            <h1 class="title">Get started as an Influencer</h1>
            <div class="field">
                <label>Email</label>
                <b-input v-model="email" type="email" class="input" aria-describedby="emailDisclaimer" ></b-input>
                <b-form-text id="emailDisclaimer">
                    Shown to brands only when you accept.
                </b-form-text>
            </div>
            <div class="field">
                <label>Password</label>
                <b-input v-model="password" type="password" class="input" aria-describedby="emailDisclaimer" />
            </div>

            <router-link to="/influencerSignupName" class="router-link-text-button">
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

<style>

    .fields {
        padding-left: 48px;
        padding-right: 48px;
        max-width: 480px;
    }

    .field {
        margin-bottom: 16px;
        margin-top: 16px;
    }

</style>