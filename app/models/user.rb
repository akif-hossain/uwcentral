class User
  include Mongoid::Document
  include Mongoid::Attributes::Dynamic
  before_save { self.email = email.downcase }

  field :name, type: String
  field :email, type: String
  field :password, type: String

  validates :email, presence: true
  VALID_EMAIL_REGEX = /\A[\w+\-.]+@[a-z\d\-.]+\.[a-z]+\z/i
  validates :email, presence: true,
                    format: { with: VALID_EMAIL_REGEX },
                    uniqueness: { case_sensitive: false }
  # has_secure_password
  # attr_accessible :email, :password, :password_confirmation
  validates :password, length: { minimum: 6 }

end
