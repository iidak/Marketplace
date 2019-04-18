<template>
    <div class="view-main">
        <img class="img" src="../assets/checkmark.svg"/>
        <h1>You've been matched!</h1>
        <p>Check your email for the contact details of the campaign owner.</p>
        <router-link to="/landingPage" class="router-link-text-button">
            <b-button class="button-main">OK</b-button>
        </router-link>
    </div>
</template>

<script>
    export default {
        name: "success"
    }
</script>

<style scoped>

</style>