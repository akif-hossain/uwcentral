Uwcentral::Application.routes.draw do
  resources :users
  get "home/index"
  root to: 'home#index'

  match '/signup', to: 'users#new', via: 'get'
end
