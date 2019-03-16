<template>
    <div>
        <router-link to="/influencerPage" style="align-content: right">
            <p>Switch to Influencer</p>
        </router-link>
        <CreateCampaign>Create Campaign</CreateCampaign>
    </div>
</template>

<script>
    import CreateCampaign from '../components/CreateCampaign.vue'
    export default {
        name: 'brand-page-test',
        components: {
            CreateCampaign
        }
    }
</script>

<style>

</style>