<template>
    <div>
        <h1 class="title">Where Influencers and Brands meet</h1>
        <p>I am</p>
        <router-link to="/brandPage" class="router-link-text-button">
            <b-button class="button-main">Brand</b-button>
        </router-link>

        <router-link to="/influencerPage" class="router-link-text-button">
            <b-button class="button-main">Influencer</b-button>
        </router-link>
    </div>
</template>

<script>


    export default {
        name: "landing-page"
    }
</script>


<style>

    .button-main {
        background-color: #538DFF !important;
        font-size: 16px !important;
        border-radius: 100px !important;
        min-width: 140px !important;
        border-color: #538DFF !important;
        margin: 8px;
        padding: 10px;
        min-height: 48px;
        font-weight: bold;
    }

    .button-secondary {
        background-color: #fff !important;
        border-color: #d8d8d8 !important;
        color: #000 !important;
    }

    .title {
        font-weight: bold;
    }

    .router-link-text-button {
        text-align: center;
        display: inline-block;
        color: white;
        text-decoration: none;
        font-size: 16px;
    }

    .view-main {
        padding: 24px;
    }
</style>