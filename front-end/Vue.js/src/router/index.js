import Vue from 'vue'
import Router from 'vue-router'
import Main from '@/components/Main'

import Users from '@/components/User/Users'

import MyPage from '@/components/User/MyPage/MyPage';

import Messages from '@/components/User/Messages/Messages';

import Friends from '@/components/User/Friends/Friends';

import MyNotes from '@/components/User/MyNotes/MyNotes';

import Settings from '@/components/User/Settings/Settings';

// UserMessages
import UserMessages from '@/components/User/Messages/UserMessages/UserMessages';

// MessagesTest
import MessagesTest from '@/components/User/Messages/MessagesTest/MessagesTest';
import MessagesTestIn from '@/components/User/Messages/MessagesTest/MessagesTestIn';
import MessagesTestOut from '@/components/User/Messages/MessagesTest/MessagesTestOut';


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main
    },
    {
    	path: '/users',
    	name: 'Users',
    	component: Users
    },
    {
      path: '/messages',
      name: 'Messages',
      component: Messages
    },
    {
      path: '/friends',
      name: 'Friends',
      component: Friends
    },
    {
      path: '/mynotes',
      name: 'MyNotes',
      component: MyNotes
    },
    {
      path: '/settings',
      name: 'Settings',
      component: Settings
    },
    {
      path: '/mypage',
      name: 'MyPage',
      component: MyPage
    },
    {
      path: '/usermessages',
      name: 'UserMessages',
      component: UserMessages
    },
    {
      path: '/messagesTest',
      name: 'MessagesTest',
      component: MessagesTest
    },
    {
      path: '/messagesTestIn',
      name: 'MessagesTestIn',
      component: MessagesTestIn
    },
    {
      path: '/messagesTestOut',
      name: 'MessagesTestOut',
      component: MessagesTestOut
    }
  ]
})
