# Influencer marketplace

Overview and goals:
Create a platform/marketplace to connect influencers and businesses. Businesses can create campaigns that can be completed by influencers by posting images to their social accounts.

Influencer goals: can sign up to the page. Can wait for offers, then accept and get connected with brands (see their email).
Brand goals: can sign up to the page. Can create campaigns and wait influencers to accept them. Once influencer accepts they see their emails.

Business case: Freemium business model for businesses. Ask money from brands if they want to get an access to the full lsit of influencer matches to their campaign. Platform is free to use for influencers.

# User stories:

As an influencer I want to set up a profile

As an influencer, as I am setting up my profile, I want to specify my interests and audience

As a logged in influencer I want to see available campaign offers

As a logged in influencer I want to accept an available campaign offer

As a logged in influencer I want to decline an available campaign offer

As a company representative I want to set up a profile for my company

As a logged in company representative I want to make a campaign

As a logged in company representative, as I am making a campaign, I want to specify the target audience

As a logged in company representative I want to see influencers, who are interested in my campaign

As a logged in company representative I want to accept an influencer who is interested in my campaign

As a logged in company representative I want to decline an influencer who is interested in my campaign

As a logged in company representative I want to remove my campaign

# First iteration results:

User interface and interaction prototype is done for both sides. Accessible in Sketch.

Influencer flow:
Choose Brand or Influencer –> Enter email, password –> Enter name –> Enter social platform links –> Set up profile (audience, interests) –> Welcome popup –> Dashboard –> Wait offers –> Accept offer –> Wait for Brand to accept –> Get connected with Brand

Brand flow:
Choose Brand of Influencer –> Enter business name, contact person name –> Enter email, password –> Dashboard –> Create a campaign -> Enter campaign description —> Enter campaign audience –> Review campaign –> Wait for matches –> Accept matches –> Get connected with Influencer

Interactive prototype video: https://www.dropbox.com/s/efeuk092dk8vw39/Influencer_Flow.mov?dl=0
Prototype files: https://www.dropbox.com/sh/njej9vv6d6dz7bl/AAC0xlVpCRJsPYAlOl_1nmbNa?dl=0

Tech results:
Successful post method with Vue.js interface;
Implemented "Router" logic to Vue.js to build views;
Learnd Spring Boot;
Learned Vue.js;
Did a experiment with Maven development, but it failed because we based it on an old tutorial and dependencies did not work well. We couldn't fix it, so started with new project based on given template which works with Gradle.

Sten is working on backend (learning and writing Spring Boot).
Iida and Nils are working on frontend (learning and writing Vue.js; designing user flows).

We met up 2x every week (6h each week) to discuss the project details together. This was followed by individiual work.

What could have been better:
– setting up the project took a lot of time
– both frontend and backend needed to work side-by-side to have some successful results. Should get better with time

# Second iteration goals:

Frontend – understand how views work in Vue.js and how to navigate between them (eg. Submit button leads to Dashboard).
Influencer can see campaigns posted by brands (get method to Influencer flow)
Brand can post campaigns (post method to Brand flow)
