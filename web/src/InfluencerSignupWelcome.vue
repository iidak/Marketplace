<template>
    <div class="view-main">
        <img src="./assets/checkmark.svg" alt="">
        <h1 class="title">Welcome!</h1>
        <p>Set up profile in the future, currently go to dashboard</p>
        <router-link to="/influencerPage" class="router-link-text-button">
            <b-button type="submit" class="button-main" @click="postPost">Set up profile</b-button>
        </router-link>
    </div>
</template>

<script>
    export default {
        name: "influencer-signup-welcome"
    }
</script>

<style scoped>

</style>