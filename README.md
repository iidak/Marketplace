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
Together the group came up with the idea and plan for the project; Also together the group was able to connect frontend with backend.

We met up 2x every week (6h each week) to discuss the project details together. This was followed by individiual work.

What could have been better:
– setting up the project took a lot of time
– both frontend and backend needed to work side-by-side to have some successful results. Should get better with time.

First iteration presentation slides: https://docs.google.com/presentation/d/1B17UtEQercZqSQC2F9rdt5r1uQMoINQeG-X3_ecDr3w/edit?usp=sharing

# Second iteration goals:

Frontend – understand how views work in Vue.js and how to navigate between them (eg. Submit button leads to Dashboard).
Influencer can see campaigns posted by brands (get method to Influencer flow)
Brand can post campaigns (post method to Brand flow)

# 6th week retro:
Continue doing:\
– meetings together\
Stop doing:\
– development should happen before meetings and not on meetings\
Start doing:\
– separate development\
– more work

# 6th week standup:
– Vue.js paging is clear\
– Frontend for signups is done\
– Backend should support multiple users\
– Frontend next do offer showing

# Security overview
– Scripts entered to input fields do not run the posted scripts.\
– SQL injections are not possible\
– We could hash the password we use for our mail provider, but it's not visibly used in frontend, so not critical.\
– We could add email verification, so you can't post an offer unless you verify your email with a generated code.\
\
Overview of our work in the class:
- We added email verification to backend, which sends an email with a verification code to the given email address
- We also added email verification to frontend, so now only brands with verified emails can make campaigns


# Functional requirements and test cases
- When a campaign is successfully added it can be seen under the influencers tab.
  1. User navigates to the brand page
  2. User fills needed fields
  3. User verifies their e-mail address with the verification code
  4. Campaign gets posted
  5. User navigates to the influencers tab
  6. User can see the posted campaign
- When you are under the influencer tab, you can see all the available campaigns.
  1. User navigates to the influencer page
  2. Available campaigns are shown
- When you have entered your e-mail address as a brand, you will receive a verification code to the entered e-mail address.
  1. User navigates to the brand page
  2. User fills needed fields, including e-mail
  3. User receives their verification code to their e-mail address 
- When a correct code is entered, the campaign gets posted.
  1. User navigates to the brand page
  2. User fills needed fields
  3. User verifies their e-mail address with the verification code
  4. If the verification code is correct, the campaign gets posted
- When an incorrect code is entered, the campaign won't be posted.
  1. User navigates to the brand page
  2. User fills needed fields
  3. User verifies their e-mail address with the verification code
  4. If the verification code is incorrect, the campaign won't get posted
- When an influencer enters it's email address under a campaign, then the influencer and the campaign owner will both get e-mails   containing each other's e-mail addresses.
  1. User navigates to the influencer page
  2. Available campaigns are shown
  3. User clicks the "Interested" button on a campaign
  4. User enters their e-mail address and clicks "Send"
  5. User and the campaign owner both receive an e-mail containing each other's email addresses
# Non-Functional requirements
- The user understands how to get to the brand page.
- The user understands how to get to the influencers page.
- The user understands what needs to be entered in order to create a campaign.
- The user understands how the e-mail verification works.
- The user understands how to link to a campaign image.
- The user understands how to show interest in a campaign.
- The application works both in mobile and desktop

# 12th week retro

Continue doing:\
– weekly meetings together\
– resolving problems in smaller pieces\
– fast decision making and development\
Stop doing:\
– development should happen before meetings and not on meetings\
Start doing:\
– more work
- uploading the application on AWS
- make sure that the front-end and back-end are integrated in AWS

# 3th iteration mid-term review:
– backend code cleanup by Sten\
– frontend added success pages and more information from influencer by Iida\
– backend started AWS by Nils

Problems:\
– AWS account creation\
– time pressure from other subjects

Plans:\
– finish AWS\
– wrap up the project with the team
