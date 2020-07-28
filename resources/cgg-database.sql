-- :name create-boardgame-table
-- :command :execute
-- :result :raw
-- :doc Creates BoardGame table
CREATE TABLE board_game (
  game_id     INTEGER AUTO_INCREMENT PRIMARY KEY,
  name        TEXT NOT NULL,
  summary     TEXT
  min_players INTEGER
  max_players INTEGER
  created_at  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
)
