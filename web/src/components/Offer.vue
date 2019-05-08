<template>
    <div class="view-main">
        <li v-for="offer in msg" :key="offer.id">
            <div class="offer-card">
                <p>Campaign by {{offer.brandName}}</p>
                <img class="img-circle" :src=offer.photo>
                <h1 class="title">{{offer.title}}</h1>
                <p>{{offer.description}}</p>
                <b-button class="button-main" @click="showModal(offer)">Interested</b-button>
            </div>
        </li>
        <b-modal ref="myModalRef" hide-footer title="">
            <div class="d-block text-center">
                <h3>Write {{brand}} an email pls</h3>
                <p>You will recieve an email with {{brand}} contact details.</p>
                <form class="fields">
                    <b-form-group
                            :invalid-feedback="errors.first('email')"
                            :state="!errors.has('email')"
                            class="field">
                        <label>Contact email: </label>
                        <b-form-input
                                :state="errors.has('email') ? false : null"
                                v-model="emailInfluencer"
                                v-validate="'required|email'"
                                name="email"
                                type="email"
                                class="input"
                        ></b-form-input>
                    </b-form-group>

                    <b-form-group class="fields-left">
                        <label>Link to your social account: </label>
                        <b-form-input
                                v-model="social"
                                data-vv-as="field"
                                name="social"
                                type="text"
                                class="input">
                        </b-form-input>
                    </b-form-group>
                </form>
            </div>
            <b-button class="button-main" @click="sendEmails">Send</b-button>
        </b-modal>
    </div>
</template>

<script>
    import axios from "axios";
    import router from "../router.js";

    export default {
        name: "offer",
        props: {
            msg: Array,
        },
        data() {
            return {
                email: "",
                brand: "",
                emailInfluencer: "",
                social: ""
            }
        },
        methods: {
            showModal: function(offer) {
                this.email = offer.email;
                this.brand = offer.brandName;
                this.$refs.myModalRef.show()
            },
            hideModal() {
                this.$refs.myModalRef.hide()
            },
            sendEmails() {
                this.$validator.validateAll().then((result => {
                    if (result) {
                        axios.post('http://localhost:8080/sendemail',
                            {
                                influencer: this.emailInfluencer,
                                brand: this.email,
                                social: this.social
                            });
                    }
                    this.hideModal();
                    router.push('/successEmails');
                }))
            }
        }
    }
</script>

<style>

    li {
        list-style-type: none;
    }

    .offer-card {
        padding: 16px;
        border: 3px solid #f5f5f5;
        margin-bottom: 24px;
        max-width: 640px;
        margin-left: auto;
        margin-right: auto;
    }

    .img-circle {
        object-fit: cover;
        height: 64px;
        width: 64px;
        border-radius: 50%;
        margin: 8px 16px 16px;
    }

</style>