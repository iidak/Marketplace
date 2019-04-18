<template>
    <div class="view-main">
        <img class="img" src="../assets/checkmark.svg"/>
        <h1>Campaign posted!</h1>
        <p>Once someone is interested in your campaign, you'll receive an email.</p>
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