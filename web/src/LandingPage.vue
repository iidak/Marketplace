<template>
    <div>
        <h1>Where Influencers and Brands meet</h1>
        <p>I am</p>
        <button class="main-button">
            <router-link to="/brandPage" class="main-button-text">Brand</router-link>
        </button>
        <button class="main-button">
            <router-link to="/influencerPage" class="main-button-text">Influencer</router-link>
        </button>
    </div>
</template>

<script>



    export default {
        name: "landing-page"
    }
</script>


<style>

    .main-button {
        background-color: #538DFF;
        padding: 15px 32px;
        text-align: center;
        display: inline-block;
        min-width: 140px;
        color: white;
        text-decoration: none;
        font-size: 16px;
        border-radius: 100px;
    }

    .main-button-text {
        text-align: center;
        display: inline-block;
        min-width: 140px;
        color: white;
        text-decoration: none;
        font-size: 16px;
        border-radius: 100px;
    }
</style>