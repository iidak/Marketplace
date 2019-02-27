<template>
    <div>
        <CreateCampaign v-if="hasCampaign"></CreateCampaign>
        <BrandDashboard v-else>
        </BrandDashboard>
    </div>
</template>

<script>
    import CreateCampaign from './components/CreateCampaign.vue'
    import BrandDashboard from './components/BrandDashboard.vue'
    export default {
        name: 'brand-page-test',
        components: {
            CreateCampaign,
            BrandDashboard,
        },
        data: function () {
            return {
                hasCampaign: true
            }
        }
    }
</script>

<style>

</style>